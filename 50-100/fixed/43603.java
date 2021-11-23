@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj != null)
        if (mLat.equals(((com.mapotempo.fleet.core.model.submodel.Location) (obj)).mLat))
            if (mLon.equals(((com.mapotempo.fleet.core.model.submodel.Location) (obj)).mLon))
                return true;
            
        
    
    return false;
}