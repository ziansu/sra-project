public static void changeField(java.lang.String column, java.lang.String row, java.lang.String player) {
    int columnNum = java.lang.Integer.parseInt(column);
    int rowNum = java.lang.Integer.parseInt(row);
    if (player.equals("p")) {
        service.FieldVisualizer.currentField[(rowNum + 1)][((columnNum * 2) + 1)] = 1;
    }else
        if (player.equals("ai")) {
            service.FieldVisualizer.currentField[(rowNum + 1)][((columnNum * 2) + 1)] = 0;
        }
    
}