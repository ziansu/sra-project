private void setApiFields() {
    this.injectMixin();
    dk.muj.derius.api.DeriusAPI.setDLang(dk.muj.derius.entity.MLang.get());
    dk.muj.derius.DeriusCore.inject();
}