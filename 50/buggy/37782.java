public boolean is_blank() {
    return ((ascii.length) == 0) && ((text_path.equals(org.made.neohabitat.mods.Paper.EMPTY_PAPER_REF)) || (text_path.isEmpty()));
}