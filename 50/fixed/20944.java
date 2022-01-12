public boolean hasPriceChanged() {
    return (this.changeGenerator.nextInt(3)) == 2;
}