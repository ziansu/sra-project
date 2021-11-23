@javax.annotation.Nonnull
public gr8pefish.ironbackpacks.api.backpack.variant.BackpackSize applySizeSpecialtyModifier(@javax.annotation.Nonnull
gr8pefish.ironbackpacks.api.backpack.variant.BackpackSpecialty specialty, @javax.annotation.Nonnegative
int rowIncreaseAmount, @javax.annotation.Nonnegative
int colIncreaseAmount) {
    if (specialty.equals(BackpackSpecialty.STORAGE)) {
        return new gr8pefish.ironbackpacks.api.backpack.variant.BackpackSize(((this.getRows()) + rowIncreaseAmount), ((this.getColumns()) + colIncreaseAmount));
    }else {
        return this;
    }
}