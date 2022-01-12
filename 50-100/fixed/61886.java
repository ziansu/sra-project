public core.model.Choice getCorrect() {
    if ((((this.choices.size()) != 0) && ((this.choices.size()) > (this.correct_id))) && ((this.correct_id) != (-1))) {
        return this.choices.get(this.correct_id);
    }
    return null;
}