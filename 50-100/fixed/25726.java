public void print_board() {
    java.lang.System.out.println("Initializing print_board");
    java.lang.System.out.print("Deck size: ");
    print_deck_size();
    java.lang.System.out.print("Card queue: ");
    print_card_queue();
    java.lang.System.out.print("Foundations: ");
    print_foundations();
    java.lang.System.out.println("Tableau: ");
    print_piles();
    print_columns();
}