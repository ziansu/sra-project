@java.lang.Override
public void remove(int position) {
    if ((fieldIsInArrayLength(position)) && (position < (size()))) {
        if (isLastField(position)) {
            arrayList = giveBackIncreasedArray(arrayList);
        }
        for (int i = position; i <= ((size()) - 1); i++) {
            arrayList[i] = arrayList[(i + 1)];
        }
        (counter)--;
    }else
        throw new java.lang.IllegalArgumentException("Der Wert ist hier nicht zulässig, da er außerhalb des Wertebereichsliegt!");
    
}