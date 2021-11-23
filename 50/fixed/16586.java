public java.lang.String get_answer_string() {
    if (type.equals("MC")) {
        return ((java.lang.String) (selections.get(answer_index)));
    }
    return answer_str;
}