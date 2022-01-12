public static com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag valueOf(byte flagByte) {
    if ((flagByte & 8) == 1)
        return com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag.BypassRelativeMoveInline;
    else
        if ((flagByte & 4) == 1)
            return com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag.BypassAbsoluteMoveInline;
        else
            if ((flagByte & 2) == 1)
                return com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag.BypassSpaceCharactersVariableSpaceCharacters;
            else
                if ((flagByte & 1) == 1)
                    return com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag.NoBypass;
                else
                    return null;
                
            
        
    
}