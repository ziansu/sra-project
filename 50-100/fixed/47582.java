public java.lang.Boolean checkPatch() {
    java.lang.String infoToPrint = "";
    java.lang.Boolean temp = false;
    for (int i = 0; i < (patches.size()); i++) {
        if (patches.get(i).isitremovable()) {
            infoToPrint += "Object Destroyed";
            infoToPrint += patches.get(i).id;
            infoToPrint += " - timeOut";
            main.Prototype.printOut(infoToPrint);
            patches.remove(patches.get(i));
            temp = true;
        }
    }
    return temp;
}