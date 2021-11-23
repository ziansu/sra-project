public java.lang.String getHtml() {
    return metaData.grade.Tools.getQuestionHtml(this.question, ((this.q_type) == (MetaData.TEXT) ? getTextHtml() : (this.q_type) == (MetaData.RADIO) ? getRadioHtml() : getCheckHtml()));
}