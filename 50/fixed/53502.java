public co.uk.epicguru.languages.utils.LanguagePack merge(java.lang.String newName, co.uk.epicguru.languages.utils.LanguagePack other) {
    co.uk.epicguru.languages.utils.LanguagePack newPack = this.clone(newName);
    newPack.inject(other);
    return newPack;
}