private void remove(java.lang.String[] words) {
    if ((current.getEntries().size()) > 0) {
        java.util.ArrayList<Entry> result = view(words);
        java.lang.System.out.println("Enter the number of the entry you wish to remove, -1 to cancel: ");
        int input = cur.nextInt();
        if (input < (words.length)) {
            current.removeEntry(result.get((input - 1)).getId());
        }else {
            java.lang.System.out.println("No entries found; nothing to remove!");
        }
    }
}