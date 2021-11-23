private void setApiFields() {
    this.injectMixin();
    dk.muj.derius.DeriusCore.inject();
    dk.muj.derius.api.DeriusAPI.setDLang(dk.muj.derius.entity.MLang.get());
}