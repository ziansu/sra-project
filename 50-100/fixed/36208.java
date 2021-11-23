public int total() {
    int total = this.cards[0].getNumber();
    java.lang.System.out.println(total);
    total += this.cards[1].getNumber();
    java.lang.System.out.println(total);
    total += this.cards[2].getNumber();
    java.lang.System.out.println(total);
    total += this.cards[3].getNumber();
    java.lang.System.out.println(total);
    return total;
}