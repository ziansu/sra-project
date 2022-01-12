@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if ((this) == obj)
        return true;
    else
        if (obj instanceof com.leviathanstudio.mineide.model.base.BaseDataContent) {
            com.leviathanstudio.mineide.model.base.BaseDataContent armor = ((com.leviathanstudio.mineide.model.base.BaseDataContent) (obj));
            this.data.equals(armor.data);
        }
    
    return false;
}