@java.lang.Override
public int compareTo(com.dstevens.character.DisplayablePlayerCharacterTrait that) {
    return com.dstevens.character.DisplayablePlayerCharacterTrait.DisplayTraitComparator.ORDINAL.thenComparing(com.dstevens.character.DisplayablePlayerCharacterTrait.DisplayTraitComparator.RATING).thenComparing(com.dstevens.character.DisplayablePlayerCharacterTrait.DisplayTraitComparator.SPECIALIZATOIN).compare(this, that);
}