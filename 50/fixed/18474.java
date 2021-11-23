public static jMono_Framework.math.Vector2 transform(jMono_Framework.math.Vector2 value, jMono_Framework.math.Quaternion rotation) {
    jMono_Framework.math.Vector2 result = new jMono_Framework.math.Vector2();
    jMono_Framework.math.Vector2.transform(value, rotation, result);
    return result;
}