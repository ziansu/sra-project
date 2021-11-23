public boolean load(java.io.File file) {
    try (java.util.Scanner in = new java.util.Scanner(file)) {
        while (in.hasNextLine()) {
            cards.Card card = parseCard(in.nextLine());
            if (card != null)
                library.putIfAbsent(card.getName(), card);
            
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
    return true;
}