protected play.twirl.api.Content renderForm(java.lang.Object key, play.data.Form<M> form) {
    return render(templateForForm(), play.utils.crud.CRUDController.with(keyClass, key).and(play.data.Form.class, form));
}