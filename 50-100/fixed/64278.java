public static com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag valueOf(byte flagByte) {
    if ((flagByte & 8) == 8)
        return com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag.BypassRelativeMoveInline;
    else
        if ((flagByte & 4) == 4)
            return com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag.BypassAbsoluteMoveInline;
        else
            if ((flagByte & 2) == 2)
                return com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag.BypassSpaceCharactersVariableSpaceCharacters;
            else
                if ((flagByte & 1) == 1)
                    return com.mgz.afp.ptoca.controlSequence.PTOCAControlSequence.PTOCA_BypassFlag.NoBypass;
                else
                    return null;
                
            
        
    
}