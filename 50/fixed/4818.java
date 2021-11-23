private void delete() {
    mInput.deleteCharAt(((mInput.length()) - 1));
    if ((mInput.length()) == 0) {
        mInput.append("0");
    }
    evaluate();
}