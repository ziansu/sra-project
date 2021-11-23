@java.lang.Override
public java.lang.String[] export() {
    pl.com.bottega.photostock.sales.model.Money price = getPrice();
    java.lang.String tagsJoined = java.lang.String.join(" ", this.getTags());
    return new java.lang.String[]{ getNumber() , java.lang.String.valueOf(price.cents()) , java.lang.String.valueOf(price.getCurrency()) , java.lang.String.valueOf(isAvailable()) , java.lang.String.valueOf(length) , "" , "Clip" };
}