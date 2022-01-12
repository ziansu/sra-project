public int getRelativeMajor(int note) {
    int relativeMajor = 0;
    for (int j = 0; j < (SIZE_OF_NOTES_ARRAY); j++) {
        if ((notes[j]) == note) {
            int index = (j + 3) % (SIZE_OF_NOTES_ARRAY);
            relativeMajor = notes[index];
            break;
        }
    }
    return relativeMajor;
}