public ru.maklas.eldarya.beans.Account create() {
    if (((sessID) != null) && ((rememberMe) != null)) {
        return new ru.maklas.eldarya.beans.Account(id, rememberMe, sessID);
    }else {
        return null;
    }
}