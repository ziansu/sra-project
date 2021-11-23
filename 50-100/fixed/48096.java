public int getRelativeMinor(int note) {
    int relativeMinor = 0;
    for (int j = 0; j < (SIZE_OF_NOTES_ARRAY); j++) {
        if ((notes[j]) == note) {
            int index = (j - 3) % (SIZE_OF_NOTES_ARRAY);
            if (index < 0) {
                index += 12;
            }
            relativeMinor = notes[index];
            break;
        }
    }
    return relativeMinor;
}