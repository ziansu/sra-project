@java.lang.Override
public void success(co.gov.inci.evaluon.backend.models.classes.authentication.Token token, retrofit.client.Response response) {
    userToken = token;
    co.gov.inci.evaluon.backend.models.classes.user.Evaluee.Info evaluee = new co.gov.inci.evaluon.backend.models.classes.user.Evaluee.Info(co.gov.inci.evaluon.backend.models.classes.user.Evaluee.genderById(gender.getCheckedRadioButtonId()), co.gov.inci.evaluon.backend.models.classes.user.Evaluee.disabilitiesById(disability.getCheckedRadioButtonId()), co.gov.inci.evaluon.backend.models.classes.user.Evaluee.typesById(type.getCheckedRadioButtonId()), co.gov.inci.evaluon.backend.models.classes.user.Evaluee.levelsById(level.getCheckedRadioButtonId()));
    api.createEvaluee(token.toString(), evaluee, evalueeCallback);
}