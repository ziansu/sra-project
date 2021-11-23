private void doDoorAction(int number) {
    switch (de.harry_r.adventskalender.Utils.Utils.checkDate(number)) {
        case 0 :
            de.harry_r.adventskalender.Utils.Utils.showCommentTooEarly(this);
            break;
        case 1 :
            break;
        case 2 :
            de.harry_r.adventskalender.Utils.Utils.showCommentTooLate(this);
            break;
    }
}