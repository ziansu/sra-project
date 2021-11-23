@java.lang.Override
public void update(org.niord.core.promulgation.BaseMessagePromulgation promulgation) {
    if (promulgation instanceof org.niord.core.promulgation.AudioMessagePromulgation) {
        super.update(promulgation);
        org.niord.core.promulgation.AudioMessagePromulgation p = ((org.niord.core.promulgation.AudioMessagePromulgation) (promulgation));
        p.setText(text);
    }
}