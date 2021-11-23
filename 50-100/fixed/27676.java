public void addAnswer(java.lang.String answer) {
    answer = com.lorepo.icf.utils.StringUtils.unescapeXML(answer);
    answer = answer.replaceAll("&nbsp;", " ");
    answers.add(answer);
    if (isIgnorePunctuation) {
        answer = com.lorepo.icplayer.client.module.text.GapInfo.removePunctuation(answer);
    }
    checkAnswers.add((isCaseSensitive ? answer : answer.toLowerCase()));
}