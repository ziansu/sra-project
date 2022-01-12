public void reverseGreaterThan(int k) {
    for (int i = 0; i < (element.length); i++) {
        if ((element[i]) > k) {
            if (debug) {
                java.lang.System.out.println(("Reversed all elements greater than: " + k));
            }
            dir[i] *= -1;
        }
    }
}