public int[] comboSize() {
    int[] comboSize = new int[6];
    for (int i = 0; i < (comboSize.length); i++) {
        comboSize[i] = comboList.get(i).size();
        if ((comboSize[i]) == 2)
            comboSize[i] = 3;
        
    }
    return comboSize;
}