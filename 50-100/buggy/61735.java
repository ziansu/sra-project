@java.lang.Override
public void characters(final char[] buffer, final int start, final int length) {
    java.lang.String string = new java.lang.String(buffer, start, length);
    if ((this.type) != null) {
        switch (this.type) {
            case ID :
                storeProfile(string);
                break;
            case MODULE :
                this.currentBuildProfile.moduleList.put(string, new com.tifsoft.mavenbuildbuddy.model.BuildModule(string, null));
                this.type = null;
                break;
            default :
                break;
        }
    }
}