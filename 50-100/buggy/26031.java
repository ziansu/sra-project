private void readInReadings() {
    try {
        java.io.BufferedReader inputReader = new java.io.BufferedReader(new java.io.InputStreamReader(getActivity().openFileInput(bit.mazurdm1.atmos.Fragment_a.FILENAME_DATA)));
        dataList = bit.mazurdm1.atmos.LogData.loadFromFile(inputReader);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}