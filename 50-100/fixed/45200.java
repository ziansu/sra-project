public void onAddUpdate(final java.lang.String front, final java.lang.String back) {
    if (mCard.exists()) {
        update(front, back);
    }else {
        add(front, back);
        if (mAddEditCardView.addReversedCard()) {
            add(back, front);
        }
    }
}