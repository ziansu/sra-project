@java.lang.Override
public void onClick(android.view.View v) {
    try {
        retrieveDataFromBasicKidFields();
        kid.setId(Daos.KID.save(kid));
        startKidActivity(kid);
    } catch (ar.edu.unlp.info.hermescelascolus.validation.ValidationError validationError) {
    }
}