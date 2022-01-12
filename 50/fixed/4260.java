protected void register() {
    goosezilla.greenpower.util.ItemUtil.registerBlock(this, this.getItemBlock(), this.getBaseName(), this.getAddToCreativeTab());
    this.registerRendering();
}