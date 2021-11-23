private void addExtraToken() {
    if ((extraTokens.size()) > 0) {
        termAtt.setEmpty().append(extraTokens.get(0).toString());
        extraTokens.remove(0);
        if ((extraTokens.size()) == 0) {
            emitExtraTokens = false;
        }
    }else {
        emitExtraTokens = false;
    }
}