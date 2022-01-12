public void showEmotion(java.lang.String emotion, int time) {
    switch (emotion) {
        case "Neutral" :
            showNeutral(time);
            break;
        case "SmileVerySlight" :
            showVerySlightSmile(time);
            break;
        case "SmileSlight" :
            showSmileSlight(time);
            break;
        case "SmileAlmostFull" :
            showAlmostFull(time);
            break;
        case "SmileFull" :
            showSmileFull(time);
            break;
        default :
            throw new java.lang.RuntimeException("Expression not Found");
            break;
    }
}