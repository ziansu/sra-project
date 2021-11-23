public void setCurrentSelectedEntity(engine.EntityStatic newSelectedEntity) {
    try {
        if (newSelectedEntity != null) {
            if ((currentSelectedEntity) != null) {
                if ((currentSelectedEntity.isSelected) == true)
                    currentSelectedEntity.isSelected = false;
                
            }
            currentSelectedEntity = newSelectedEntity;
            currentSelectedEntity.isSelected = true;
        }else {
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}