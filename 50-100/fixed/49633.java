private void selectCategorie() {
    convDB.openForRead();
    conv = convDB.randomConv(selection);
    convDB.close();
    if ((conv) != null) {
        question.setText(conv.getConv());
        image.setImageResource(conv.getImg());
    }
}