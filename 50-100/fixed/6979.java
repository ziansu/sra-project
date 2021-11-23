@java.lang.Override
public java.lang.String image() {
    if (top.has(Trait.strapped)) {
        return "doggy_ff_strapped.jpg";
    }
    if (top.useFemalePronouns()) {
        if (bottom.hasDick()) {
            return "futa_futa_doggy.jpg";
        }
        return "futa_doggy.jpg";
    }
    return "doggy.jpg";
}