public void setState(com.nekretnine.models.Advertisement.State state) {
    if (state == (Advertisement.State.OPEN)) {
        setState(com.nekretnine.dto.AdvertisementDTO.State.OPEN);
    }else
        if (state == (Advertisement.State.EXPIRED)) {
            setState(com.nekretnine.dto.AdvertisementDTO.State.EXPIRED);
        }else
            if (state == (Advertisement.State.REPORTED)) {
                setState(com.nekretnine.dto.AdvertisementDTO.State.REPORTED);
            }else
                if (state == (Advertisement.State.REMOVED)) {
                    setState(com.nekretnine.dto.AdvertisementDTO.State.REMOVED);
                }else {
                    setState(com.nekretnine.dto.AdvertisementDTO.State.SOLD);
                }
            
        
    
}