public java.lang.Boolean checkPatch() {
    java.lang.String infoToPrint = "";
    java.lang.Boolean temp = false;
    for (main.Patch patch : patches) {
        if (patch.isitremovable()) {
            infoToPrint += "Object Destroyed";
            infoToPrint += patch.id;
            infoToPrint += " - timeOut";
            main.Prototype.printOut(infoToPrint);
            patches.remove(patch);
            temp = true;
        }
    }
    return temp;
}