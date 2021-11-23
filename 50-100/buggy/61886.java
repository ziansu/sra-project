public core.model.Choice getCorrect() {
    if (((this.choices.size()) != 0) && ((this.choices.size()) > (this.correct_id))) {
        return this.choices.get(this.correct_id);
    }
    return null;
}