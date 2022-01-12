protected org.daisy.pipeline.braille.common.Break breakWord(java.lang.String word, int limit, boolean force) {
    if ((limit >= 4) && (word.equals("busstopp")))
        return new org.daisy.pipeline.braille.common.Break("bussstopp", 4, true);
    else
        if (force)
            return new org.daisy.pipeline.braille.common.Break(word, limit, true);
        else
            return new org.daisy.pipeline.braille.common.Break(word, 0, false);
        
    
}