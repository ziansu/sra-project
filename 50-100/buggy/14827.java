public void flipLastCard() {
    if (((unseenCardList.size()) > 0) && (seeableCardList.isEmpty())) {
        Card c = unseenCardList.remove(((unseenCardList.size()) - 1));
        c.flip();
        seeableCardList.add(c);
    }else {
        java.lang.System.out.println("don't call this method you fool");
    }
}