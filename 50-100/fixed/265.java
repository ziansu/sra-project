@java.lang.Override
public int countOption(int tag) {
    rate = 1;
    if ((links) != null) {
        for (int j = 0; j < (links.size); j++) {
            rate *= links.get(j).countOption(tag);
        }
    }
    return rate;
}