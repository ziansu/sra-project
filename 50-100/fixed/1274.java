private void insertSort(int begin, int end) {
    for (int runner = begin + 1; runner < (end + 1); runner++) {
        for (int switcher = runner; switcher > 0; switcher--) {
            if ((subArray[switcher]) < (subArray[(switcher - 1)])) {
                swap(switcher, (switcher - 1));
            }
        }
    }
}