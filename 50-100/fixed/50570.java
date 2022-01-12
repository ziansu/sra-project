public void updateAllOwnerShip(field[] arrayOfFields) {
    for (int i = 0; i < (arrayOfFields.length); i++) {
        if ((arrayOfFields[i]) instanceof controllers.Ownable) {
            if ((((controllers.Ownable) (arrayOfFields[i])).getOwner()) != null) {
                desktop_resources.GUI.setOwner((i + 1), ((controllers.Ownable) (arrayOfFields[i])).getOwner().getName());
            }
        }
    }
}