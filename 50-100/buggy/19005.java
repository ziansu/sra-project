@java.lang.Override
public boolean allow() {
    if ((rules) != null) {
        boolean flag = false;
        for (org.jackhuang.hellominecraft.launcher.core.version.Rules r : rules)
            if ("disallow".equals(r.action()))
                return false;
            else
                if ("allow".equals(r.action()))
                    flag = true;
                
            
        
        return flag;
    }else
        return true;
    
}