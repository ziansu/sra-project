private void selectCategorie() {
    convDB.openForRead();
    conv = convDB.randomConv(selection);
    convDB.close();
    question.setText(conv.getConv());
    image.setImageResource(conv.getImg());
}