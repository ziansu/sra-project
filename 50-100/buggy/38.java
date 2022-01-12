public boolean canLoadNext() {
    if (isLoading)
        return false;
    else
        if ((getNextDataURL(pageData)) != null) {
            if ((pageData.curruntPage) == 1)
                return true;
            else
                if (getPagingSupport()) {
                    if ((pageData.curruntPage) == (pageData.totalPage))
                        return false;
                    else
                        if (isAllPageLoaded)
                            return false;
                        else
                            return true;
                        
                    
                }
            
            return true;
        }else
            return false;
        
    
}