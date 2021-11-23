public boolean load(java.io.File file) {
    try (java.util.Scanner in = new java.util.Scanner(file)) {
        while (in.hasNextLine()) {
            java.lang.String str = in.nextLine();
            cards.Card card = parseCard(str);
            if (card != null)
                library.putIfAbsent(card.getName(), str);
            
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
    return true;
}