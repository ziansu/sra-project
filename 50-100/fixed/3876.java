public void loadGame(int _boardSize, java.io.File _saveFile, int _loadJSONPosition) {
    try {
        loadJSONPosition = _loadJSONPosition;
        saveFile = _saveFile;
        boardSize = _boardSize;
        board = new me.valesken.jeff.sudoku_structure.Board(boardSize);
        java.io.BufferedReader buff = new java.io.BufferedReader(new java.io.FileReader(saveFile));
        org.json.JSONObject jsonObject = new org.json.JSONObject(buff.readLine());
        buff.close();
        difficulty = board.loadGame(jsonObject);
    } catch (java.io.IOException | org.json.JSONException e) {
        e.printStackTrace();
    }
}