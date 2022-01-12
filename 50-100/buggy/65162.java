public java.lang.Boolean checkPatch() {
    java.lang.String infoToPrint = "";
    java.lang.Boolean temp = false;
    infoToPrint += "Object Destroyed";
    for (main.Patch patch : patches) {
        if (patch.isitremovable()) {
            infoToPrint += patch.id;
            patches.remove(patch);
            temp = true;
        }
    }
    infoToPrint += " - timeOut";
    main.Prototype.printOut(infoToPrint);
    return temp;
}